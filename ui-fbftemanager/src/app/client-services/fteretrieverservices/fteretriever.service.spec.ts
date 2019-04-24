import { TestBed } from '@angular/core/testing';

import { FteretrieverService } from './fteretriever.service';

describe('FteretrieverService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FteretrieverService = TestBed.get(FteretrieverService);
    expect(service).toBeTruthy();
  });
});
