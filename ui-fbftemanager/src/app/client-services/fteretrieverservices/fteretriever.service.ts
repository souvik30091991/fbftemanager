import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { DatePipe } from '@angular/common';
import { MatTableDataSource } from '@angular/material';
@Injectable({
    providedIn: 'root'
})
export class FteretrieverService {

    constructor(private httpServices: HttpClient, private datePipe: DatePipe) { }
    private fteDataRetrievedSet: any[] = [];
    private backUrl = '';
    dataSource: MatTableDataSource<any> = new MatTableDataSource();

    baseUrl = 'http://localhost:8090/ftefetch/fetchftedata/';
    getDataAfterSearch(): any {
        return this.httpServices.get(this.baseUrl);
    }

    getDataFromDateRange(weekStDt, weekEdDt): any {
        this.backUrl = 'byDate/';
        const params = new HttpParams().set('weekStDt', weekStDt).set('weekEdDt', weekEdDt);
        console.log(params);
        return this.httpServices.get(this.baseUrl + this.backUrl, { params });
    }


    getDatafromTrack(track): any {
        this.backUrl = 'byTrack/';
        const params = new HttpParams().set('track', track);
        console.log(params);
        return this.httpServices.get(this.baseUrl + this.backUrl, { params });
    }


    getDataFromDtRangenTrack(track, weekStDt, weekEdDt): any {
        this.backUrl = 'byDatenTrack/';
        const params = new HttpParams().set('weekStDt', weekStDt)
            .set('weekEdDt', weekEdDt)
            .set('track', track);
        console.log(params);
        return this.httpServices.get(this.baseUrl + this.backUrl, { params });
    }

    getDatafromTrackArray(track): MatTableDataSource<any> {
        this.getDatafromTrack(track).subscribe(
            resp => {
                Object.assign(this.fteDataRetrievedSet, resp);
                this.dataSource.data = this.fteDataRetrievedSet;
            });
        return this.dataSource;
    }
    getDataFromDateRangeArray(weekStDt, weekEdDt): MatTableDataSource<any> {
        this.getDataFromDateRange(this.datePipe.transform(new Date(weekStDt), 'yyyy-MM-dd'), this.datePipe.transform(new Date(weekEdDt), 'yyyy-MM-dd')).subscribe(
            resp => {
                Object.assign(this.fteDataRetrievedSet, resp);
                this.dataSource.data = this.fteDataRetrievedSet;
            });
        return this.dataSource;
    }

    getDataFromDtRangenTrackArray(track, weekStDt, weekEdDt): MatTableDataSource<any> {
        this.getDataFromDtRangenTrack(track, this.datePipe.transform(new Date(weekStDt), 'yyyy-MM-dd'),
            this.datePipe.transform(new Date(weekEdDt), 'yyyy-MM-dd')).subscribe(
                resp => {
                    Object.assign(this.fteDataRetrievedSet, resp);
                    this.dataSource.data = this.fteDataRetrievedSet;
                });
        return this.dataSource;
    }

    getAllDataInArrayFormat(): MatTableDataSource<any> {
        this.getDataAfterSearch().subscribe(
            resp => {
                Object.assign(this.fteDataRetrievedSet, resp);
                this.dataSource.data = this.fteDataRetrievedSet;
            });
        return this.dataSource;
    }

    getDataInArrayFormat(fterecordmodel): MatTableDataSource<any> {
        this.dataSource.data = [];
        this.fteDataRetrievedSet = new Array();
        this.backUrl = '';
        if (fterecordmodel.track === undefined && fterecordmodel.weekStDt === undefined) {
            return this.getAllDataInArrayFormat();
        } else {
            if (fterecordmodel.track === 'All') {
                return this.getDataFromDateRangeArray(fterecordmodel.weekStDt, fterecordmodel.weekEdDt);
            } else if (fterecordmodel.weekStDt === undefined && fterecordmodel.weekEdDt === undefined) {
                return this.getDatafromTrackArray(fterecordmodel.track);
            } else {
                return this.getDataFromDtRangenTrackArray(fterecordmodel.track, fterecordmodel.weekStDt, fterecordmodel.weekEdDt);
            }
        }

    }
}
