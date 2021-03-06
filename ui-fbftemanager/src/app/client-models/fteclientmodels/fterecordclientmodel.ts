export class FteRecordClientModel {
    public track: string;
    public ftesPerRosterCount: number;
    public defectCount: number;
    public widgetCount: number;
    public ftesLoanedCount: number;
    public ptoCount: number;
    public ftesBorrowedCount: number;
    public ftesForPerformanceCount: number;
    public ftesForExtendedScenarioExecCount: number;
    public defectFteCount: number;
    public excessFteCount: number;
    public workableDefectsCount: number;
    public medsDefAnalysisCount: number;
    public weekStDt: Date;
    public weekEdDt: Date;
    public ndeDefectAnalysis: number;
    public note: string;
    /*  constructor(
         public track: string,
         public ftesPerRosterCount: number,
         public defectCount: number,
         public widgetCount: number,
         public ftesLoanedCount: number,
         public ptoCount: number,
         public ftesBorrowedCount: number,
         public ftesForPerformanceCount: number,
         public ftesForExtendedScenarioExecCount: number,
         public excessFteCount: number,
         public edtDetailsCount: number,
         public diQueriesCount: number,
         public weekStDt: Date,
         public note: string,
     ) { } */

    constructor() { }
}
