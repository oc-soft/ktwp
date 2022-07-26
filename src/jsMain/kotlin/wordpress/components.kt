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

@file:JsModule("@wordpress/components")
@file:JsNonModule
package wordpress.components


external interface PanelBodyProps: react.Props {

    var title: String

    var opened: Boolean

    var icon: dynamic

    var onToggle: (dynamic) -> Unit

    var buttonProps: dynamic

    var className: String
}

external val PanelBody: react.FC<PanelBodyProps> 


external interface PanelRowProps: react.Props {

    var className: String

    var ref: dynamic

}

external val PanelRow: react.FC<PanelRowProps>

external interface PanelHeaderProps: react.Props {

    var label: String
}

external val PanelHeader: react.FC<PanelRowProps>


external interface ToggleControlProps: react.Props {
   
    var label: String
    var help: dynamic 

    var checked: Boolean

    var disabled: Boolean

    var onChange: (Boolean)->Unit

    var className: String
}


external val ToggleControl: react.FC<ToggleControlProps>


external val Modal: (dynamic) -> dynamic

external interface ButtonProps: react.Props {

    var disabled: Boolean
    var href: String

    var variant: String

    var isDestructive: Boolean

    var isSmall: Boolean

    var isPressed: Boolean

    var isBusy: Boolean
    
    var focus: Boolean

    var target: String

    var className: String

    var icon: dynamic
    

    var iconSize: Number

    var text: String

    var showTooltip: Boolean

    var tooltipPosition: String

    var shortcut: dynamic 

    var label: String 
    
}

external val Button: react.FC<ButtonProps>


external interface FlexProps: react.Props {
    var align: dynamic
    var direction: String

    var expaned: Boolean
    var gap: dynamic

    var justify: dynamic 

    var wrap: Boolean
}

external val Flex: react.FC<FlexProps> 


external interface FlexItemProps: react.Props {
    var display: dynamic
    var isBlock: Boolean
}

external val FlexItem: react.FC<FlexItemProps> 

external interface IconProps: react.Props {
    var icon : Any?

    var size: Number
}


external val Icon: react.FC<IconProps> = definedExternally

external interface RangeControlProps: react.Props {

    var label: String
    var help: dynamic

    var beforeIcon: String
    var afterIcon: String
    var allowReset: Boolean
    var disabled: Boolean
    var initialPosition: Number  
    var isShiftStepEnabled: Boolean  
    var marks: Array<Any>
    
    var onChange: (Number)->Unit

    var min: Number
    var max: Number

    var railColor: String
    
    var renderTooltipContent: (Number)->String

    var resetFallbackValue: Number 

    var showTooltip: Boolean

    var step: Number
    var shiftStep: Number  

    var trackColor: String
    var value: Number

    var withInputField: Boolean

    var icon: String

    var separatorType: String  

    var type: String
}


external val RangeControl: react.FC<RangeControlProps> 



external interface NumberControlProps: react.Props {

    var dragDirection: String

    var dragThreshold: Number

    var hideHTMLArrows: Boolean
    
    var isDragEnabled: Boolean

    var isShiftStepEnabled: Boolean 

    var label: String

    var labelPosition: String

    var required: Boolean

    var shiftStep: Number

    var step: Number
}

@JsName("__experimentalNumberControl")
external val NumberControl: react.FC<NumberControlProps>
    


external interface UnitControlProps: react.Props {
    var autoComplete: String
    var className: String
    var disabled: Boolean
    var disableUnits: Boolean
    var isPressEnterToChange: Boolean
    var isResetValueOnUnitChange: Boolean
    var isUnitSelectTabbale: Boolean
    var label: String
    var onChange: (String, dynamic)->Unit
    var onUnitChange: (String, dynamic)->Unit
    var size: String
    var unit: String
    var units: Array<dynamic> 
    var value: dynamic
}

@JsName("__experimentalUnitControl")
external val UnitControl: react.FC<UnitControlProps>


external interface DividerProps: react.Props {

    var margin: Number
    var marginEnd: Number
    var orientain: String
}

@JsName("__experimentalDivider")
external val Divider: react.FC<DividerProps>

external interface InputControlProps: react.Props {
    var disabled: Boolean


    var isPressEnterToChange: Boolean

    var hideLabelFromVision: Boolean

    var label: String
    
    var labelPosition: String

    var onChange: (String)->Unit 

    var prefix: react.ReactNode

    var size: String

    var type: String

    var suffix: react.ReactNode

    var value: String 
}

@JsName("__experimentalInputControl")
external var InputControl: react.FC<InputControlProps>


external interface TextProps: react.Props {

    var adjustLineHightForInnerControls: dynamic

    var align: String
    var color: dynamic

    var display: String

    var ellipsis: String

    var ellipsizeMode: String 

    var highlightCaseSensitive: Boolean

    var highlightEscape: Boolean

    var highlightSanitaize: Boolean

    var highlightWords: Array<String>

    var isBlock: Boolean
    
    var isDestructive: Boolean

    var limit: Int

    var lineHight: dynamic

    var numberOfLines: Int

    var optimizeReadablityFor: dynamic

    var size: dynamic

    var truncate: Boolean

    var upperCase: Boolean

    var variant: String

    var weight: dynamic
}


external var Text: react.FC<TextProps>


external interface ColorPickerProps: react.Props {

    var color: String

    var onChange: (String)->Unit

    var enableAlpha: Boolean

    var copyFormat: String 
}

external var ColorPicker: react.FC<ColorPickerProps>


external interface TextControlProps: react.Props {
    var label: String
    var hideFromVision: Boolean
    var help: String
    var type: String
    var value: dynamic
    var onChange: (dynamic)->Unit
}

external var TextControl: react.FC<TextControlProps>



external interface RadioControlProps: react.Props {

    var label: String

    var help: String

    var selected: dynamic


    var options: Array<dynamic>

    var onChange: (dynamic)->Unit
}

external var RadioControl: react.FC<RadioControlProps>


// vi: se ts=4 sw=4 et:
