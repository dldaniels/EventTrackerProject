import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Run } from '../models/run';

@Injectable({
  providedIn: 'root'
})
export class RunService {

  constructor(private http: HttpClient) { }

  private baseUrl = 'http://localhost:8085/';
  //baseUrl = '/RunTracker/';
  private url = this.baseUrl + 'api/runs'


  index(): Observable<Run[]> {
    return this.http.get<Run[]>(this.url + '?sorted=true').pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('error loading run list');
      })
    );
  }

  public create(run: Run): Observable<Run> {
    const httpOptions = {
      headers: {
        'Content-type': 'application/json'
      }
    };
    return this.http.post<Run>(this.url, run, httpOptions)
    .pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error creating run');
      })
    );
  }

  public update(run: Run): Observable<Run> {
    const httpOptions = {
      headers: {
        'Content-type': 'application/json'
      }
    };
    return this.http.put<Run>(this.url + '/' + run.id, run, httpOptions)
    .pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error updating run');
      })
    );
  }

  public disable(id: number): Observable<boolean> {
    return this.http.delete<boolean>(this.url + '/' + id).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error deleting run');
      })
    );
  }
}
