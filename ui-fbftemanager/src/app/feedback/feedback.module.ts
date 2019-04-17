import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeedbackCmpComponent } from './feedback-cmp/feedback-cmp.component';
import { ViewfeedbackCmpComponent } from './viewfeedback-cmp/viewfeedback-cmp.component';

@NgModule({
  declarations: [ FeedbackCmpComponent, ViewfeedbackCmpComponent],
  imports: [
    CommonModule,
  ]
})
export class FeedbackModule { }
