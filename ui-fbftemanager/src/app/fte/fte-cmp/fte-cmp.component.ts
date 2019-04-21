import { Component, OnInit } from '@angular/core';
import { FteRecordClientModel } from 'src/app/client-models/fteclientmodels/fterecordclientmodel';
import { FterecorderclientsvcService } from 'src/app/client-services/fterecorderservices/fterecorderclientsvc.service';
import { MatDialog } from '@angular/material';
import { OkdialogcmpComponent } from 'src/app/dialogs/okdialogcmp/okdialogcmp.component';

@Component({
    selector: 'app-fte-cmp',
    templateUrl: './fte-cmp.component.html',
    styleUrls: ['./fte-cmp.component.scss']
})
export class FteCmpComponent implements OnInit {

    fterecordmodel: FteRecordClientModel = new FteRecordClientModel();
    fterecordmodelArr: FteRecordClientModel[] = [this.fterecordmodel];

    constructor(private fterecsvc: FterecorderclientsvcService, private okDialogue: MatDialog) { }

    ngOnInit() {
    }

    submitMe() {
        console.log(this.fterecordmodelArr);
        this.fterecsvc.recordIt(this.fterecordmodelArr)
            .subscribe(
                data => {
                    console.log('Success!', data);
                    this.okDialogue.open(OkdialogcmpComponent, {
                        data: {
                            message: 'Submitted Successfully!',
                            buttonText: {
                                ok: 'OK'
                                // cancel: 'No'
                            }
                        }
                    });
                },
                error => {
                    console.error('Error!', error);
                    this.okDialogue.open(OkdialogcmpComponent, {
                        data: {
                            message: 'Something went wrong! Please try again/Contact the administrator!',
                            buttonText: {
                                ok: 'OK'
                                // cancel: 'No'
                            }
                        }
                    });
                }
            );

    }

}
