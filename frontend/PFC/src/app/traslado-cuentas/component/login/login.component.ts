import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  texto: string = '';
  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.texto = this.route.snapshot.data['texto'];
  }

}
