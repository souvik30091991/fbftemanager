import { TestBed } from '@angular/core/testing';

import { FterecorderclientsvcService } from './fterecorderclientsvc.service';

describe('FterecorderclientsvcService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FterecorderclientsvcService = TestBed.get(FterecorderclientsvcService);
    expect(service).toBeTruthy();
  });
});
