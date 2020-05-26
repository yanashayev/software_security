//
// Created by יאנה on 5/11/2020.
//
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>


void nullPointer(int* a){
    printf("approach to null pointer \n");
    int *c = {*a};
    //printf("%d\n",c);
}

int main(){

        int* a=NULL;
        nullPointer(a);

    return 0;
}
