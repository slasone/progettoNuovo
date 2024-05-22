/*import { CommonModule, JsonPipe, NgIf } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {Component, NgModule} from '@angular/core';
import {takeUntilDestroyed} from '@angular/core/rxjs-interop';
import {FormControl, Validators, FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {merge} from 'rxjs';
import { usersService } from '../services/users.service';

/** @title Form field with error messages *//*
@Component({
  selector: 'form-field-error-example',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
  standalone: true,
  imports: [CommonModule ,RouterOutlet, JsonPipe, MatFormFieldModule, MatInputModule, FormsModule, ReactiveFormsModule],
})
export class AppComponent {
  email = new FormControl('', [Validators.required, Validators.email]);

  errorMessage = '';

  constructor(private service:usersService) {
    merge(this.email.statusChanges, this.email.valueChanges)
      .pipe(takeUntilDestroyed())
      .subscribe(() => this.updateErrorMessage());
  }

  updateErrorMessage() {

    this.service.getTutorials().subscribe()
    if (this.email.hasError('required')) {
      this.errorMessage = 'You must enter a value';
    } else if (this.email.hasError('email')) {
      this.errorMessage = 'Not a valid email';
    } else {
      this.errorMessage = '';
    }
  }
}*/

import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CardAuthModule, LoginFormModule } from '../components';

@Component({
  selector: 'app-sign-in-form',
  templateUrl: './login.component.html',
  styleUrls: ['./sign-in-form.component.scss']
})
export class AppSignInComponent {
  constructor() { }
}

@NgModule({
  imports: [
    CommonModule,
    LoginFormModule,
    CardAuthModule,
  ],
  providers: [],
  exports: [AppSignInComponent],
  declarations: [AppSignInComponent],
})
export class AppSignInModule { }