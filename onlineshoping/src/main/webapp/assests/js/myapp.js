$(function(){
	
	switch (name) {
	case "Contact":
		$('#contact').addClass('active');
		break;
	case "About":
		$('#about').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
	
	
	
});