import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefectretrieverCmpComponent } from './defectretriever-cmp.component';

describe('DefectretrieverCmpComponent', () => {
  let component: DefectretrieverCmpComponent;
  let fixture: ComponentFixture<DefectretrieverCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefectretrieverCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefectretrieverCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
