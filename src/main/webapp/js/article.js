/**
 * Created by Erika on 2017/3/6.
 */
window.addEventListener("load", function () {
    handleSave();
});

var getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
};

function handleSave() {
    $("#save-btn").on("click", function () {
        var id = getUrlParameter('id');
        if (id == undefined)
            $.ajax({
                url: "/articles/save",
                type: "post",
                data: {
                    title: $("#head").val(),
                    html: CKEDITOR.instances.editor1.getData()
                },
                success: function (data) {
                    // 成功以后要做的事
                    alert("保存成功");
                },
                error: function (jqXhr, textStatus, errorThrown) {
                    console.log(errorThown);
                }

            });
        else
            $.ajax({
                url: "/articles/save",
                type: "post",
                data: {
                    id: id,
                    title: $("#head").val(),
                    html: CKEDITOR.instances.editor1.getData()
                },
                success: function (data) {
                    // 成功以后要做的事
                    alert("保存成功");
                },
                error: function (jqXhr, textStatus, errorThrown) {
                    console.log(errorThown);
                }

            });
    });
}