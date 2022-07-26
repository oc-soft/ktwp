/*
 * Copyright 2022 oc-soft
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JsModule("@wordpress/block-editor")
@file:JsNonModule
package wordpress.blockEditor


external interface InspectorControlsProps: react.Props {

    var group: String
}

external val InspectorControls: react.FC<InspectorControlsProps> = 
    definedExternally

@JsName("InspectorAdvancedControls")
external val InspectorAdvancedControls: react.FC<react.Props> = 
    definedExternally


@JsName("__experimentalUseColorProps")
external fun useColorProps(attributes: dynamic): dynamic


@JsName("__experimentalGetColorClassesAndStyles")
external fun getColorClassesAndStyles(attributes: dynamic): dynamic



/**
 * media place holder properties
 */
external interface MediaPlaceholderProps: react.Props {

    var accept: String

    var addToGallery: Boolean

    var allowedTypes: Array<String>

    var autoOpenMediaUpload: Boolean

    var className: String

    var disableDropZone: Boolean

    var dropZoneUIOnly: Boolean

    var icon: Any

    var isAppender: Boolean

    var disableMediaButtons: Boolean

    var labels: Any

    var multiple: Boolean


    var mediaPreview: dynamic

    var onError: (dynamic)->Unit

    var onFilesPreUpload: (dynamic)->Unit

    var onSelect: (dynamic)->Unit

    var value: dynamic

    var onSelectURL: (dynamic)->Unit

    var handleUpload: Boolean

}
                        
external val MediaPlaceholder: react.FC<MediaPlaceholderProps> = 
    definedExternally


external interface MediaReplaceFlowProps: react.Props {
    var mediaURL: String 

    var mediaId: String

    var mediaIds: Array<String>

    var allowedTypes: Array<String>

    /**
     * form file upload accept property
     */
    var accept: String

    /**
     * handle file upload error
     */
    var onError: (String)->Unit

    /**
     * selected files file uploads
     */
    var onSelect: (dynamic)->Unit

    var onSelectURL: (String)->Unit

    var onToggleFeaturedImage: ()->Unit

    var useFeaturedImage: Boolean

    var onFilesUpload: (dynamic)->Unit

    var name: String

    var createNotice: Boolean

    var removeNotice: Boolean

    var multiple: Boolean

    var addToGallery: Boolean

    var handleUpload: Boolean
}

external val MediaReplaceFlow: react.FC<MediaReplaceFlowProps> =
    definedExternally


external interface BlockIconProps: react.Props {
    
    var className: String
    
    var icon: Any

    var showColors: Boolean
}

external val BlockIcon: react.FC<BlockIconProps>  =
    definedExternally


external interface BlockControlsProps: react.Props {
    var group: String

    /**
     * controls belong to toolbar groups
     */
    var controls: Array<dynamic>
}


external val BlockControls: react.FC<BlockControlsProps> = 
    definedExternally


external interface ColorGradientSettingsDropdownProps: react.Props {

    var disableCustomColors: Boolean

    var disableCustomGradients: Boolean

    var enableAlpha: Boolean

    var settings: dynamic
    
    @JsName("__experimentalHasMultipleOrigins")
    var hasMultipleOrigins: Boolean

    @JsName("__experimentalIsRenderedInSidebar")
    var isRenderedInSidebar: Boolean

    var panelId: String
}

external val ColorGradientSettingsDropdown: 
    react.FC<ColorGradientSettingsDropdownProps> = definedExternally


external interface ColorGradientControlProps: react.Props {

    @JsName("__experimentalHasMultipleOrigings")
    var hasMultipleOrigins: Boolean

    @JsName("__experimentalIsRenderedInSidebar")
    var isRenderedInSidebar: Boolean

    var className: String 

    var label: String

    var onColorChange: (dynamic)->Unit

    var onGradientChange: (dynamic)->Unit

    var colorValue: String

    var gradientValue: String

    var clearable: Boolean

    var enableAlpha: Boolean

    var showTitle: Boolean

}

external val ColorGradientControl: 
    react.FC<ColorGradientControlProps> = definedExternally


external interface PanelColorGradientSettingsProps: react.Props {

    var className: String

    var disableCustomColors: Boolean

    var disableCustomGradients: Boolean

    var settings: dynamic

    var title: String

    var showTitle: Boolean

    var __experimentalHasMulitpleOrigins: Boolean

    var __experimentalIsRenderedInSidebar: Boolean

    var enableAlpha: Boolean
}

@JsName("__experimentalPanelColorGradientSettings")
external val PanelColorGradientSettings:
    react.FC<PanelColorGradientSettingsProps> = definedExternally


external interface PanelColorSettingsProps: react.Props {

    var className: String

    var disableCustomColors: Boolean

    var disableCustomGradients: Boolean

    var colorSettings: Array<dynamic> 

    var title: String

    var showTitle: Boolean

    var __experimentalHasMultipleOrigins: Boolean

    var __experimentalIsRenderedInSidebar: Boolean

    var enableAlpha: Boolean
}

@JsName("PanelColorSettings")
external val PanelColorSettings:
    react.FC<PanelColorSettingsProps> = definedExternally



/*
 * redux store
 */
external val store : dynamic = definedExternally


/**
 * create block property to be saved
 */
external fun useBlockProps(
    props: dynamic = definedExternally,
    options: dynamic = definedExternally): Any


/**
 * create inner block property to be saved
 */
external fun useInnerBlockProps(
    props: dynamic = definedExternally,
    options: dynamic = definedExternally): Any


/**
 * get preview image canvas style
 */
@JsName("__experimentalUseResizeCanvas")
external fun useResizeCanvas(deviceType: String): dynamic



// vi: se ts=4 sw=4 et:
