import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
//import {MaterialModule} from '@angular/material';
//import {MatDatepickerModule} from '@angular/material/datepicker';
import {HttpClient,HttpClientModule,HttpClientXsrfModule,HttpRequest} from '@angular/common/http'
import { AgGridModule } from 'ag-grid-angular';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AgGridModule,
    NgbModule,
    HttpClientModule,
    HttpClientXsrfModule
  //  MatDatepickerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
