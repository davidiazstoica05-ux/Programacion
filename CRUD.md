//CRUD 



//Create 



public void agregar (Móvil p, int cont) {





lista\[cont]=p;



}



//Read 

public void mostrar (){



&nbsp;	for (int i=0; i<móvil.length; i++){

&nbsp;	

&nbsp;	syso(movil\[i]);



&nbsp;	}



//buscar 



public Producto buscarPorID(int ID){

int i=0;

boolean encontrar = false; 

&nbsp;	

&nbsp;	while(i > móvil.length \&\& !encontrar)

&nbsp;		

&nbsp;		if(movil\[i].getid == id){

&nbsp;			

&nbsp;			encontrar = true; 

&nbsp;		



&nbsp;		}else {

&nbsp;			encontrar = false; 

&nbsp;		}





}





&nbsp;	if(encontrar){

&nbsp;	return m\[i];

&nbsp;	} else {

&nbsp;	return null; 

&nbsp;	}







//delete



public void delete (int id){



Producto p = buscarPorID(int ID);



if(p != null)

&nbsp;	p.setActivo(false);



}











//mostrar un array de objetos 



public Producto\[] buscarArrayObjeto(String name){



Producto \[] listaAux = new Producto \[listaProducto.lenght] 



for (int i = 0; i < listaAux.lenght; i++)



if ( listaProducto\[i].getName.equalsIgnoreCase(name)){



&nbsp;	listaAux\[]=listaProducto\[i]; 

&nbsp;	}

return listaAux; 

}	a

