/**
 * Created by Erika on 2017/3/6.
 */
window.addEventListener("load", function(){
    handleSave();
});

function handleSave(){
    $("#save-btn").on("click",function(){
        $.ajax({
            url:"/articles/save",
            type:"post",
            data:{
                title:$("#head").val(),
                html:CKEDITOR.instances.editor1.getData()
            },
            success:function(data) {
                // 成功以后要做的事
                alert("保存成功");
            },
            error:function(jqXhr,textStatus,errorThrown){
                console.log(errorThown);
            }

        });
    });
}