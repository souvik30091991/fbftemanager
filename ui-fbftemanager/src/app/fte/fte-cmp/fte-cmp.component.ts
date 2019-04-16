import { Component, OnInit } from '@angular/core';
import { FteRecordClientModel } from 'src/app/fte/client-models/fterecordclientmodel';
import { FterecorderclientsvcService } from '../client-services/fterecorderclientsvc.service';

@Component({
    selector: 'app-fte-cmp',
    templateUrl: './fte-cmp.component.html',
    styleUrls: ['./fte-cmp.component.scss']
})
export class FteCmpComponent implements OnInit {

    fterecordmodel: FteRecordClientModel = new FteRecordClientModel();
    fterecordmodelArr: FteRecordClientModel[] = [this.fterecordmodel];

    constructor(private fterecsvc: FterecorderclientsvcService) { }

    ngOnInit() {
    }

    submitMe() {
        console.log(this.fterecordmodelArr);
        this.fterecsvc.recordIt(this.fterecordmodelArr)
            .subscribe(
                data => console.log('Success!', data),
                error => console.error('Error!', error)
            );

    }

}
