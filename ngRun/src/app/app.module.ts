import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http';
import { RunService } from './services/run.service';
import { RunListComponent } from './components/run-list/run-list.component';


@NgModule({
  declarations: [
    AppComponent,
    RunListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    // NgbModule,
    HttpClientModule
  ],
  providers: [RunService],
  bootstrap: [AppComponent]
})
export class AppModule { }
