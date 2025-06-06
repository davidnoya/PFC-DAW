import { TestBed } from '@angular/core/testing';

import { BancaElectronicaService } from './banca-electronica.service';

describe('BancaElectronicaService', () => {
  let service: BancaElectronicaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BancaElectronicaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
