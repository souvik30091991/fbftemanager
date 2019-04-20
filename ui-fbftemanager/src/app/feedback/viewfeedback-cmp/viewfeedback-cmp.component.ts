import { Component, OnInit } from '@angular/core';
import { FeedbackRecordClientModel } from 'src/app/client-models/feedbackclientmodels/feedbackrecordclientmodel';
import { FeedbackretrieverclientsvcService } from 'src/app/client-services/feedbackretrieverservices/feedbackretrieverclientsvc.service';

@Component({
    selector: 'app-viewfeedback-cmp',
    templateUrl: './viewfeedback-cmp.component.html',
    styleUrls: ['./viewfeedback-cmp.component.scss']
})
export class ViewfeedbackCmpComponent implements OnInit {

   public viewFeedbackResponses: FeedbackRecordClientModel[] = [] ;
    constructor(private retservice: FeedbackretrieverclientsvcService) { 
     this.viewFeedbackResponses = this.retservice.fetchIt();
    }
    ngOnInit() {}

}
