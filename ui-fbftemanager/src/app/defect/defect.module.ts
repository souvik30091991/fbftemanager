import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DefectloaderCmpComponent } from './defectloader-cmp/defectloader-cmp.component';
import { DefectretrieverCmpComponent } from './defectretriever-cmp/defectretriever-cmp.component';
import { CustomMaterialModule } from '../material/material.module';
@NgModule({
    declarations: [DefectloaderCmpComponent, DefectretrieverCmpComponent],
    imports: [
        CommonModule,
        CustomMaterialModule
    ]
})
export class DefectModule {

}
