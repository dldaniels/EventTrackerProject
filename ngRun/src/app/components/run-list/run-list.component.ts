import { Run } from './../../models/run';
import { Component, OnInit } from '@angular/core';
import { RunService } from 'src/app/services/run.service';

@Component({
  selector: 'app-run-list',
  templateUrl: './run-list.component.html',
  styleUrls: ['./run-list.component.css'],
})
export class RunListComponent implements OnInit {

  selected = null;
  newRun = new Run();
  editRun = null;
  makeRun = null;
  runs: Run[] = [];

  constructor(private runService: RunService) {}

  ngOnInit(): void {
    this.loadRun();
  }
  loadRun(): void {
    this.runService.index().subscribe(
      (data) => {
        this.runs = data;


        console.log('RunListComponent.loadRun(): Runs retrieved');
      },
      (err) => {
        console.error('RunListComponent.loadRun(): retrieve failed');
        console.error(err);
      }
    );
  }

  showRun(run: Run) {
    this.selected = run;
    this.editRun = Object.assign({}, this.selected);
  }

  goBack() {
    this.selected = null;

  }

  addRun(run: Run) {
    this.runService.create(run).subscribe(
      (run) => {
        this.newRun = new Run();

        this.loadRun();
        console.log('creation success!');
        // call index method on service
        window.alert('Run Created Successfully!');
      },
      (err) => {
        console.error('problem with addRun()');
      }
    );
  }

  deleteRun(run: Run) {
    // run.enabled = false;
    this.runService.disable(run.id).subscribe(
      (data) => {
        window.alert('Run Deleted Successfully');
        this.loadRun();
      },
      (err) => {
        console.error('problem with deleteRun() in run-list component');
      }
    );
  }

  // Update run
  updateRun(editRun: Run) {
    this.runService.update(editRun).subscribe(
      (data) => {
        this.loadRun();
        this.selected = null;
        window.alert('Run Updated Successfully');
      },
      (err) => {
        console.error('problem with updateRun() in run-list component');
      }
    );
  }
}
