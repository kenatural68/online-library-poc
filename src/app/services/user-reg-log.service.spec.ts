import { TestBed } from '@angular/core/testing';

import { UserRegLogService } from './user-reg-log.service';

describe('UserRegLogService', () => {
  let service: UserRegLogService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserRegLogService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
