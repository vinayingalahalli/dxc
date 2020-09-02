import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'fullName'
})
export class FullNamePipe implements PipeTransform {

  transform(value1: string, value2:string): string {
    return value1+" "+value2;
  }

}
