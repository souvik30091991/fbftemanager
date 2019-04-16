import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FteCmpComponent } from './fte-cmp.component';

describe('FteCmpComponent', () => {
  let component: FteCmpComponent;
  let fixture: ComponentFixture<FteCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FteCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FteCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
