import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FeedbackRecordClientModel } from 'src/app/client-models/feedbackclientmodels/feedbackrecordclientmodel';

@Injectable({
    providedIn: 'root'
})
export class FeedbackretrieverclientsvcService {

    getUrl = 'http://localhost:8088/feedbackretriever/';
    public viewFeedbackResponses: FeedbackRecordClientModel[] = [];
    constructor(private client: HttpClient) { }

    fetchIt(): FeedbackRecordClientModel[] {
        this.client.get(this.getUrl, { responseType: 'json' }).subscribe(
            resp => {
                Object.assign(this.viewFeedbackResponses, resp);
            });
        return this.viewFeedbackResponses;
    }


}
