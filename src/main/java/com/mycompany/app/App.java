/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
        System.out.println(2 + joy(3)); 
    }
    public static int joy(int e) {
        return e + 10;
    }
}
