import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DefectloaderCmpComponent } from './defectloader-cmp/defectloader-cmp.component';
import { DefectretrieverCmpComponent } from './defectretriever-cmp/defectretriever-cmp.component';

@NgModule({
  declarations: [DefectloaderCmpComponent, DefectretrieverCmpComponent],
  imports: [
    CommonModule
  ]
})
export class DefectModule { }
