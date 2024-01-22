<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body  background="https://media.istockphoto.com/id/1181366400/photo/in-the-hands-of-trees-growing-seedlings-bokeh-green-background-female-hand-holding-tree-on.jpg?s=612x612&w=0&k=20&c=jWUMrHgjMY9zQXsAwZFb1jfM6KxZE16-IXI1bvehjQM=">
   
    <h1 align="center">VEHICLE DATA </h1>
   
    <form action="addVehicle">
        <input type="text" name="vid" placeholder="Enter the vid"><br><br>
        <input type="text" name="vmode" placeholder="Enter the vmode"><br><br>
        <input type="text" name="vyear" placeholder="Enter the vyear"><br><br>
        <input type="text" name="color" placeholder="Enter the color"><br><br>
        <input type="submit">
    </form>
    <br>
<hr color="blue">
    <form action="getByid">
        <input type="text" name="vid" placeholder="Enter the vid"><br>
       
        <input type="submit">
    </form><br>
<hr color="blue">
    <form action="getBycolor">
        <input type="text" name="color" placeholder="Enter the color"><br>
       
        <input type="submit">
    </form><br>

    <hr color="blue">
    <form action="getByvmode">
        <input type="text" name="vmode" placeholder="Enter the vmode"><br>
       
        <input type="submit">
    </form><br>

     <hr color="blue">
    <form action="getByvyear">
        <input type="text" name="vyear" placeholder="Enter the vyear"><br>
       
        <input type="submit">
    </form><br>

    <hr color="blue">
    <form action="deleteByid">
        <input type="text" name="vid" placeholder="Enter the vid for deleting"><br>
       
        <input type="submit">
    </form><br>

      <hr>
    <form action="deletebyvmode">
        <input type="text" name="vmode" placeholder="Enter the vmode for deleting "><br>
       
        <input type="submit">
    </form><br> 

</body>
</html>