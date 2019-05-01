import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefectloaderCmpComponent } from './defectloader-cmp.component';

describe('DefectloaderCmpComponent', () => {
  let component: DefectloaderCmpComponent;
  let fixture: ComponentFixture<DefectloaderCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefectloaderCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefectloaderCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
