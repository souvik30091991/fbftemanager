import { TestBed } from '@angular/core/testing';

import { OkdialogsvcService } from './okdialogsvc.service';

describe('OkdialogsvcService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: OkdialogsvcService = TestBed.get(OkdialogsvcService);
    expect(service).toBeTruthy();
  });
});
