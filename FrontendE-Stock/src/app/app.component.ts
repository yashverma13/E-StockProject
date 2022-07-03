import { Component } from '@angular/core';
import { AgGridAngular } from 'ag-grid-angular';
import { CellClickedEvent,ColDef,GridReadyEvent } from 'ag-grid-community';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name="App";
  public columnDefs:ColDef[]=[
      {field:"stockprice",headerName:'Stock Price',sortable:true,
      filter:true,width:300},
      {field:"date", headerName:"Date",sortable:true,
      filter:true, width:300},
      {field:"time", headerName:"Time",sortable:true,
      filter:true,width:300}
  ];
  public defaultColDef:{
      //sortable:true;
      //filter:true;
      resizable: true,
  };
  public rowData=[{stockprice:555,date:"2016/06/24",time:"23:00:00"},
  {stockprice:556,date:"2016/06/25",time:"23:00:00"},
  {stockprice:557,date:"2016/06/26",time:"23:00:00"},
  {stockprice:558,date:"2016/06/22",time:"23:00:00"},
  {stockprice:559,date:"2016/06/27",time:"23:00:00"},
  ]
}
