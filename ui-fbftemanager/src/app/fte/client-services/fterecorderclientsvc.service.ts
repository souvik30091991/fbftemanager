import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FteRecordClientModel } from '../client-models/fterecordclientmodel';

@Injectable({
    providedIn: 'root'
})
export class FterecorderclientsvcService {

    postUrl =  'http://localhost:8080/fterecorder/';
    constructor(private client: HttpClient) { }

    recordIt(fteRec: FteRecordClientModel[]) {
        return this.client.post<any>(this.postUrl, fteRec);
    }
}
