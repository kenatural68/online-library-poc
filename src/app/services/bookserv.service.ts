import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Book } from '../classes/book';

@Injectable({
  providedIn: 'root'
})
export class BookservService {

  constructor(private _http : HttpClient) { }


  public addBookFromRemote(book: Book):Observable<any>{
    return this._http.post("http://localhost:8080/upload",book)
  }

  public showallbooks(){
    
    return this._http.get("http://localhost:8080/list")
  }

}
