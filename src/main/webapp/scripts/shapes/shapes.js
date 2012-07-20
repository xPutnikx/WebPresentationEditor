function getRandomArbitary(min, max)
{
  return Math.random() * (max - min) + min;
}
function rectangle(){
	shape();
	$(".selected > .content-scale > .content").append("<div style=\"width:250px;height:250px;border:1px solid #000;\"></div>");
}
function star(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"resources/assets/img/star.png\">");
}
function elipse(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"resources/assets/img/ellipse.png\">");
}
function arrowleft(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"resources/assets/img/arrowleft.png\">");
}
function arrowright(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"resources/assets/img/arrowright.png\">");
}
function arrowup(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"resources/assets/img/arrowup.png\">");
}
function gitcat1(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"https://a248.e.akamai.net/assets.github.com/images/modules/about_page/octocat.png?1338945074\">");
}
function gitcat2(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"https://a248.e.akamai.net/assets.github.com/images/modules/dashboard/bootcamp/octocat_create.png?92c30b3e\">");
}
function gitcat3(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"https://a248.e.akamai.net/assets.github.com/images/modules/dashboard/bootcamp/octocat_fork.png?822d411e\">");
}
function gitcat4(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"https://a248.e.akamai.net/assets.github.com/images/modules/dashboard/bootcamp/octocat_setup.png?b8606b19\">");
}
function gitcat5(){
	shape();
	$(".selected > .content-scale > .content").append("<img src=\"https://a248.e.akamai.net/assets.github.com/images/modules/dashboard/bootcamp/octocat_social.png?b84442eb\">");
}
function shape(){
	$("#text").click();
	$(".selected > .content-scale > .content").text("");
}