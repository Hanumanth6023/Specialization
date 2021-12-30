import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private _URL:string="http://localhost:8899";
  constructor(private http:HttpClient) { }

  saveEmp(user1:User):Observable<User>
  {

    return this.http.post<User>(`${this._URL}/saveCustomers`,user1);
  }

  getAllEmp():Observable<User[]>
  {
    return this.http.get<User[]>(`${this._URL}/Customers`);
  }
}