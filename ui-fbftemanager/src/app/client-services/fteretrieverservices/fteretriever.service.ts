import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { DatePipe } from '@angular/common';
@Injectable({
    providedIn: 'root'
})
export class FteretrieverService {

    constructor(private httpServices: HttpClient, private datePipe: DatePipe) { }
    private fteDataRetrievedSet: any[] = [];
    private backUrl = '';
    baseUrl = 'http://localhost:8090/ftefetch/fetchftedata/';
    getDataAfterSearch(track, weekStDt): any {


            return this.httpServices.get(this.baseUrl);

    }
    getDataInArrayFormat(fterecordmodel): any[] {
        console.log(fterecordmodel);
        this.getDataAfterSearch(fterecordmodel.track, fterecordmodel.weekStDt).subscribe(
            resp => {
                Object.assign(this.fteDataRetrievedSet, resp);
            });
        return this.fteDataRetrievedSet;
    }
}
