import { Component, OnInit } from '@angular/core';
import { FteRecordClientModel } from 'src/app/client-models/fteclientmodels/fterecordclientmodel';
import { FterecorderclientsvcService } from 'src/app/client-services/fterecorderservices/fterecorderclientsvc.service';
import { MatDialog } from '@angular/material';
import { OkdialogcmpComponent } from 'src/app/dialogs/okdialogcmp/okdialogcmp.component';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, Validators, FormGroup, FormControl } from '@angular/forms';

@Component({
    selector: 'app-fte-cmp',
    templateUrl: './fte-cmp.component.html',
    styleUrls: ['./fte-cmp.component.scss']
})
export class FteCmpComponent implements OnInit {

    fterecordmodel: FteRecordClientModel = new FteRecordClientModel();
    fterecordmodelArr: FteRecordClientModel[] = [this.fterecordmodel];
    postUrl = 'http://usmummukepat-r.us.deloitte.com:9129/fterecorder/';
    getFteCountUrl = 'http://usmummukepat-r.us.deloitte.com:2311/fetchftedata/getTotalFTECountByTrack/';
    fteForm: FormGroup;
    submitted = false;

    constructor(private fterecsvc: FterecorderclientsvcService, private okDialogue: MatDialog,
        private client: HttpClient, private formBuilder: FormBuilder) { }

    ngOnInit() {
        this.fterecordmodelArr[0].ftesPerRosterCount = Number(0);
        this.fterecordmodelArr[0].defectCount = Number(0);
        this.fterecordmodelArr[0].workableDefectsCount = Number(0);
        this.fterecordmodelArr[0].defectFteCount = Number(0);
        this.fterecordmodelArr[0].widgetCount = Number(0);
        this.fterecordmodelArr[0].ftesLoanedCount = Number(0);
        this.fterecordmodelArr[0].ptoCount = Number(0);
        this.fterecordmodelArr[0].ftesBorrowedCount = Number(0);
        this.fterecordmodelArr[0].ftesForPerformanceCount = Number(0);
        this.fterecordmodelArr[0].ftesForExtendedScenarioExecCount = Number(0);
        this.fterecordmodelArr[0].medsDefAnalysisCount = Number(0);
        this.fterecordmodelArr[0].ndDefectAnalysis = Number(0);
        this.fterecordmodelArr[0].excessFteCount = Number(0);

        this.fteForm = this.formBuilder.group({
            track: new FormControl({ value: this.fterecordmodelArr[0].track },
                Validators.compose([Validators.required])),
            weekStDt: new FormControl({ value: this.fterecordmodelArr[0].weekStDt },
                Validators.compose([Validators.required])),
            weekEdDt: new FormControl({ value: this.fterecordmodelArr[0].weekEdDt },
                Validators.compose([Validators.required])),
            ftesPerRosterCount: new FormControl({ value: this.fterecordmodelArr[0].ftesPerRosterCount, disabled: true },
                Validators.compose([Validators.required])),
            defectCount: new FormControl({ value: this.fterecordmodelArr[0].defectCount }, Validators.compose([Validators.required])),
            workableDefectsCount: new FormControl({ value: this.fterecordmodelArr[0].workableDefectsCount },
                Validators.compose([Validators.required])),
            defectFteCount: new FormControl({ value: this.fterecordmodelArr[0].defectFteCount }, Validators.compose([Validators.required])),
            widgetCount: new FormControl({ value: this.fterecordmodelArr[0].widgetCount }, Validators.compose([Validators.required])),
            ftesLoanedCount: new FormControl({ value: this.fterecordmodelArr[0].ftesLoanedCount },
                Validators.compose([Validators.required])),
            ptoCount: new FormControl({ value: this.fterecordmodelArr[0].ptoCount }, Validators.compose([Validators.required])),
            ftesBorrowedCount: new FormControl({ value: this.fterecordmodelArr[0].ftesBorrowedCount },
                Validators.compose([Validators.required])),
            ftesForPerformanceCount: new FormControl({ value: this.fterecordmodelArr[0].ftesForPerformanceCount },
                Validators.compose([Validators.required])),
            ftesForExtendedScenarioExecCount: new FormControl({ value: this.fterecordmodelArr[0].ftesForExtendedScenarioExecCount },
                Validators.compose([Validators.required])),
            medsDefAnalysisCount: new FormControl({ value: this.fterecordmodelArr[0].medsDefAnalysisCount },
                Validators.compose([Validators.required])),
            ndDefectAnalysis: new FormControl({ value: this.fterecordmodelArr[0].ndDefectAnalysis },
                Validators.compose([Validators.required])),
            excessFteCount: new FormControl({ value: this.fterecordmodelArr[0].excessFteCount }, Validators.compose([Validators.required])),
            note: new FormControl({ value: this.fterecordmodelArr[0].note })
        });
    }

    // convenience getter for easy access to form fields
    public get ff() { return this.fteForm.controls; }

    fetchFteCount() {
        this.fterecsvc.getFteCount(this.fterecordmodelArr[0].track)
            .subscribe(
                (data: number) => {
                    this.fterecordmodelArr[0].ftesPerRosterCount = data;
                }
            );
    }
    submitMe() {
        this.submitted = true;

        // DON'T DELETE
        //finding invalid controls (don't delete! can be used in other screens for checking!):
        /* const invalid = [];
        const controls = this.fteForm.controls;
        for (const name in controls) {
            if (controls[name].invalid) {
                invalid.push(name);
            }
        }
        console.log("Invalid Controls: ---->" + invalid); */

        // stop here if form is invalid
        if (this.fteForm.invalid) {
            return;
        }
        let sum: number = 0;
        let diff: number = 0;
        this.fterecordmodelArr.forEach((entry) => {
            sum +=
                Number(entry.defectFteCount) +
                Number(entry.widgetCount) +
                Number(entry.ptoCount) +
                Number(entry.ftesLoanedCount) +
                Number(entry.ftesBorrowedCount) +
                Number(entry.ftesForPerformanceCount) +
                Number(entry.ftesForExtendedScenarioExecCount) +
                Number(entry.medsDefAnalysisCount) +
                Number(entry.ndDefectAnalysis) +
                Number(entry.excessFteCount);
        });
        if (sum !== this.fterecordmodelArr[0].ftesPerRosterCount) {
            // console.log("Fetched count : " + this.fterecordmodelArr[0].ftesPerRosterCount);
            // console.log("Calculated count : " + sum);
            diff=Number(this.fterecordmodelArr[0].ftesPerRosterCount) - Number(sum);
            this.fterecordmodelArr[0].excessFteCount=diff;
            let dialogRef = this.okDialogue.open(OkdialogcmpComponent, {
                data: {
                    message: 'FTECount Mismatch! (The total FTE Count entered/calculated=' + sum +
                        ', Total FTECount in DB = ' + this.fterecordmodelArr[0].ftesPerRosterCount +
                        ', Total FTECount Diff = ' + diff +
                        '). Do you wish to submit anyway?',
                    buttonText: {
                        ok: 'Yes',
                        cancel: 'No'
                    }
                }
            });
            dialogRef.afterClosed().subscribe(result => {
                if (result) {
                    this.client.post<any>(this.postUrl, this.fterecordmodelArr)
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
            });
        } else {
            this.client.post<any>(this.postUrl, this.fterecordmodelArr)
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

}
