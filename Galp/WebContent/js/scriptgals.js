/**
 * 
 */

$( document ).ready(function(){
	
	
	$(" #tarjeta").on('click', function(){
		$('#trj').show('slow');
		$('#efc').hide('hilde');
		
	});
	$(" #efectivo").on('click', function(){
		$('#efc').show('slow');
		$('#trj').hide('hilde');
	});
	$("#cancelar").on('click', function(){
		$('#trj').hide();
		$('#efc').hide();
	});
	
});