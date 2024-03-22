import { TestBed } from '@angular/core/testing';

import { FetchMetodiService } from './fetch-metodi.service';

describe('FetchMetodiService', () => {
  let service: FetchMetodiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FetchMetodiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
