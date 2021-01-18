/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                            "*abc*",
                            "*ded*",
                            "*****"]
*/

String[] addBorder(String[] picture) {
    String[] newPic = new String[picture.length+2];

    String star = "";

    for (int i = 0; i < picture[0].length () + 2; i++){
        star += "*";
    }
    
    for(int i = 0; i < picture.length; i++){
            newPic[i+1] = "*"+picture[i]+"*";
        }
        
    newPic[0] = star;
    newPic[picture.length+1] = star;
    
    return newPic;
}