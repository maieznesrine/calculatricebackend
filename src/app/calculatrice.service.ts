import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CalculatriceService {

  constructor(private httpClient: HttpClient) { }
  x :number
  public ajouter():Observable<any> {
    return this.httpClient.get("http://localhost:9090/add",{params:}).subscribe(data=>this.x=data);
  }


}
