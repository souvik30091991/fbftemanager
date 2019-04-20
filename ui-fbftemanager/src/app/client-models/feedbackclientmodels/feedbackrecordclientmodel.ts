import { EmployeeClientModel } from '../commonclientmodels/employeeclientmodel';

export class FeedbackRecordClientModel {
    public id: number;
    public createDt: Date;
    public rating: number;
    public feedbackTxt: string;
    public suggestion: string;
    public employee: EmployeeClientModel;

    constructor() {
     }
}
