import { TestBed } from '@angular/core/testing';

import { FeedbackretrieverclientsvcService } from './feedbackretrieverclientsvc.service';

describe('FeedbackretrieverclientsvcService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FeedbackretrieverclientsvcService = TestBed.get(FeedbackretrieverclientsvcService);
    expect(service).toBeTruthy();
  });
});
