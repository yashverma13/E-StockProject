import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
    providedIn:'root'
})
export class EStockService{
    private servicepath=`f925-49-207-193-175.in.ngrok.io/swagger-ui/index.html#/company-controller/fetchAllCompany`
}