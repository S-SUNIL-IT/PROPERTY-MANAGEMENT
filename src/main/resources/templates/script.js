  $(document).ready(function () {

            $("#PropertyTypeID").change(function () {

                var PropertyTypeID = $(this).val();

                $("#PropertySubTypeID").empty();
                $("#PropertySubTypeID").append('<option value="">-- Select Property SubType --</option>');

                if (PropertyTypeID) {
                    $.ajax({
                        url: "/api/PSubT/" + PropertyTypeID,
                        type: "GET",

                        success: function (data) {

                            console.log(data);

                            $.each(data, function (i, PSubT) {

                                $("#PropertySubTypeID").append(
                                    '<option value="' + PSubT.propertySubTypeID + '">' +
                                    PSubT.subTypeName +
                                    '</option>'
                                );

                            });
                        },

                        error: function () {
                            alert("Failed to load Property SubTypes");
                        }
                    });
                }
            });

        });

        $(document).ready(function () {

        $("PropertySubTypeID").change(function () {
         var PropertySubTypeID = $(this.val();

        $("#PropertySizeID").empty();
        $("#PropertySizeID").append('<option value="">-- Select Property Size --</option>');

        if(PropertySubTypeID) {
        $.ajax({

         url: "/api/PropertySize/" + PropertySizeID,
                        type: "GET",

        success: function (data) {
        console.log(data);

        $.each(data, function(i,PropertySize) {

        $("#PropertySizeID").append(
         '<option value="' + PropertySize.propertySizeID + '">' +
                                    PropertySize.propertySizeName +
                                    '</option>'

         );

                            });
                        },

                        error: function () {
                            alert("Failed to load Property SubTypes");
                        }
                    });
                }
            });

        });