{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red191\green100\blue38;\red32\green32\blue32;\red153\green168\blue186;
\red109\green109\blue109;\red88\green118\blue71;\red86\green132\blue173;}
{\*\expandedcolortbl;;\csgenericrgb\c74902\c39216\c14902;\csgenericrgb\c12549\c12549\c12549;\csgenericrgb\c60000\c65882\c72941;
\csgenericrgb\c42745\c42745\c42745;\csgenericrgb\c34510\c46275\c27843;\csgenericrgb\c33725\c51765\c67843;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs24 \cf2 \cb3 package \cf4 Escuela\cf2 ;\
\
public class \cf4 Alumno\{\
   \cf2 private int \cf4 numCuenta\cf2 ;\
   private \cf4 String primerNombre\cf2 ;\
   private \cf4 String apellido\cf2 ;\
\cf5 //   private int nota;   \
   \
    \cf2 public \cf4 Alumno(\cf2 int \cf4 numCuenta\cf2 , \cf4 String primerNombre\cf2 , \cf4 String apellido) \{\
        \cf2 this\cf4 .numCuenta = numCuenta\cf2 ;\
        this\cf4 .primerNombre = primerNombre\cf2 ;\
        this\cf4 .apellido = apellido\cf2 ;\
	\cf5 //Prueba de Git\
	\cf2 this\cf4 .apellido = \cf6 "Inter"\cf2 ;\
	this\cf4 .apellido += \cf6 " Madrid"\cf2 ;\
	\
	this\cf4 .nota = Math.random() % \cf7 55 \cf4 + \cf7 2\cf2 ;\
	\
    \cf4 \}\
\
    \cf5 //GETs\
    \cf2 public int \cf4 getNumCuenta() \{\
        \cf2 this\cf4 .numCuenta = Math.random() % \cf7 100 \cf4 + \cf7 1\cf2 ;\
        return \cf4 numCuenta\cf2 ;\
    \cf4 \}\
\
    \cf2 public \cf4 String getPrimerNombre() \{\
        \cf2 return \cf4 primerNombre\cf2 ;\
    \cf4 \}\
\
    \cf2 public \cf4 String getApellido() \{\
        apellido = \cf6 "Renan"\cf2 ;\
        return \cf4 apellido\cf2 ;\
    \cf4 \}\
\
    \cf2 public int \cf4 getNota() \{\
        \cf2 return \cf4 nota\cf2 ;\
    \cf4 \}\
\
    \cf5 /*\
        Settear el numero de cuenta\
    */\
    \cf2 public void \cf4 setNumCuenta(\cf2 int \cf4 num) \{\
        \cf5 //Validar que el numero de cuenta no sea menor que 1\
    \cf4 \}\
    \
    \cf5 /*\
        Settear la nota\
    */\
    \cf2 public void \cf4 setNota(\cf2 int \cf4 note)\{\
        \cf5 //Validar que la nota est\'e9 entre 0 y 100\
    \cf4 \}\
    \
    \cf5 /*\
        Settear el primer nombre\
    */\
    \cf2 public void \cf4 setPrimerNombre(String nombre) \{\
        \cf5 //Que el nombre no tenga m\'e1s de 20 caracteres\
    \cf4 \}\
\
    \cf5 /*\
        Settear el apellido\
    */\
    \cf2 public void \cf4 setApellido(String lastName) \{\
        \cf5 //Que el nombre no tenga m\'e1s de 20 caracteres\
    \cf4 \}   \
       \
\}\
}