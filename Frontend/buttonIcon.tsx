
import React from "react";
interface buttonProps {
    text: string;
    onClick: () => void;
    className?: string;
    children?: React.ReactNode;
    icon?: React.ReactNode;
}
export const ButtonComponent = ({ text,onClick, className,icon }: buttonProps) => {
    return (
        <div className="flex items-center" >
        
            <button style={{backgroundColor: "green"}} className={className} onClick={onClick}>
                <div className="flex items-center gap-2">
                    {icon && <div className="pr-1">{icon}</div>}
                    {text}
                </div>
                
            </button>
        </div>
    );
}
