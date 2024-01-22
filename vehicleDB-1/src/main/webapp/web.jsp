<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 align="center">VEHICLE DATA </h1>
   
    <form action="adddata">
        <input type="text" name="vid" placeholder="Enter the vid"><br><br>
        <input type="text" name="vname" placeholder="Enter the vname"><br><br>
        <input type="text" name="colour" placeholder="Enter the colour"><br><br>
        <input type="text" name="rate" placeholder="Enter the rate"><br><br>
        <input type="submit">
    </form>
    <br>
<hr color="blue">

<form action="getbyid">
    <input type="text" name="vid" placeholder="Enter the vid for getting"><br><br>
    <input type="submit">
</form>
<br>
<hr color="blue">

<form action="getbyvname">
    <input type="text" name="vname" placeholder="Enter the vname for getting"><br><br>
    <input type="submit">
</form>
<br>
<hr color="blue">

<form action="deletebyid">
    <input type="text" name="vid" placeholder="Enter the vid for deleting"><br><br>
    <input type="submit">
</form>
<br>
<hr color="blue">




</body>
</html>