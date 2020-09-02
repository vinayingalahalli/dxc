import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'fullName'
})
export class FullNamePipe implements PipeTransform {

  transform(salutation: string, firstName:string,lastName:string): string {
    return salutation+" "+firstName+" "+lastName;
  }

}
