function validarForma(forma){
    var usuario=forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password=forma.password;
    if (password.value==+""){
        alert ("Debe proporcionar un password");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = forma.tecnologia;
    var checkseleccionado = false;
    for (var i=0; i < tecnologias.length; i++){
        if (tecnologias[i].checked){
            checkseleccionado=true;     
        }
    }
    if(!checkseleccionado){
        alert("Debe seleccionar al menos una tecnologia");
        return false;
    }
    var generos=forma.genero;
    var radioseleccionado=false;
    
    for (var i=0; i<generos.length; i++){
        if (generos[i].checked) radioseleccionado=true;
    }
    if (!radioseleccionado){
        alert("Debe seleccionar un genero");
    }
    var ocupacion=forma.ocupacion;
    if(ocupacion.value=== ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    alert("Formulario valido");
    return true;
}

