import { TestBed } from '@angular/core/testing';

import { FormSolicitudService } from './form-solicitud.service';

describe('FormSolicitudService', () => {
  let service: FormSolicitudService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormSolicitudService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
