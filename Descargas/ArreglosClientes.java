/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

/**
 *
 * @author Francisco PS
 */
public class ArreglosClientes
{
        private Cliente [] arreglo;
        private int indice;

        public ArreglosClientes(int max)
        {
                arreglo = new Cliente[max];
                indice = -1;
        }

        public void Insertar(Cliente datoCliente)       //Funciona bien
        {
                indice++;
                arreglo[indice] = datoCliente;
        }

        public boolean ValidarEspacio()     //Funciona Bien
        {
                if(indice >= (arreglo.length) -1)
                {
                        return false;
                }
                else
                {
                        return true;
                }
        }

        public void Listar(int pos) //Funciona Bien
        {
                arreglo[pos].listarDatos();
                arreglo[pos].getOr().getTicketCliente().imprimirTicket();
        }

        public void Listar()        //Funciona Bien
        {
                for (int i=0; i<=indice; i++) 
                {
                        arreglo[i].listarDatos();
                        System.out.println("\n\n");
                }
        }

        public int BuscarFolio(String folio)        //Funciona Bien
        {	
                for(int i=0; i<= indice; i++)
                {
                        if( folio.equalsIgnoreCase( arreglo[i].getOr().getTicketCliente().getFolio()) )
                        {
                                return i;
                        }
                }
                
                return -1;
        }


        public void Actualizar(int pos)
        {
                int opcion, opc1;
            
                do
                {
                    opcion = Menu.DesplegarMenu("\t\t\n 1) Orden \t\t\n 2) Datos Personales\t\t\n 3)Salir\n\n\tDatos que desea Actualizar:  ",3);

                    switch(opcion)
                    {
                            case 1:
                            	do{
                            	  
                            	  int opc=Menu.DesplegarMenu("1)Actualizar Hamburguesas\n2)Actualizar Bebidas\n3)salir", 3);
                            		switch(opc){
                            		case 1:  arreglo[pos].getOr().seleccionaHamburguesa();
                            		break;
                            		case 2; arreglo[pos].getOr().seleccionaBebida();
                            		break;
                            		case 3:
                                	break;
                            		}
                            	opc1=Menu.DesplegarMenu("¿Desea actualizar otro producto?\n1)Sí\n2)No", 2);
                           
                            	}while(opc1==1);
                                break;
                                
                            case 2:
                                arreglo[pos].capturarNombre();
                                arreglo[pos].capturarApellido();
                                arreglo[pos].capturaDelegacion(arreglo[pos].Delegaciones());
                                                                
                                break;
                                
                            case 3:
                                break;
                    }
                }while(opcion != 3);
        }

        public void Borrar(int pos)
        {
                Cliente aux = arreglo[pos];
                arreglo[pos] = arreglo[indice];
                indice--;               
        }

        public int Ordenar(int dato)
        {
            /*
                int aux;
                for(int i=0; i<= indice; i++)
                {
                        if(dato < arreglo[i])
                        {
                                aux=arreglo[i];
                                arreglo[i]=dato;
                                dato=aux;
                        }
                }
                return dato;
                */
            return 0;
        }

        public void Ordenar()
        {/*
                int aux;
                for(int i=0; i< indice; i++)
                {
                        for(int j=0; j<indice; j++)
                        if(arreglo[j] > arreglo[j+1])
                        {
                                aux=arreglo[j+1];
                                arreglo[j+1]=arreglo[j];
                                arreglo[j]=aux;
                        }
                }
                */
        }

        public int getIndice() 
        {
            return indice;
        }        
}