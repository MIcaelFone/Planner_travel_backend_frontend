import { useState } from "react";
import { MoveRight } from "lucide-react";
import { ButtonComponent } from "../components/buttonIcon";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { ptBR } from "date-fns/locale";
function PlanejarViagem() {
const [origem, setOrigem] = useState('');
const [dateRange, setDateRange] = useState<[Date | null, Date | null]>([null, null]);
const [startDate,endDate] = dateRange;
return (
    <div>
        <div className="flex items-center justify-center gap-2 ">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 300 300" width="40" height="40">
                <g fill="none" stroke="#ffffff" stroke-width="12">
                    <circle cx="150" cy="150" r="140" />
                    <path d="M 70,70 L 230,70 L 230,230 L 70,230 Z" />
                    <line x1="70" y1="70" x2="230" y2="230" />
                    <line x1="230" y1="70" x2="70" y2="230" />
                </g>
            </svg>
            <h2 className="text-4xl font-bold">Plan.er</h2>
        </div>
        <p className="text-gray-500 text-center">Convide seus amigos e planeje sua próxima viagem!</p>
        <div className="border-1 rounded-xl p-2 border-white flex mt-5" >
            <input
                type="text"
                placeholder="Origem"
                value={origem}
                onChange={(e) => setOrigem(e.target.value)}
                className="h-10 w-90 px-2 border-0 rounded-lg text-lg focus:outline-none"
            />
            <DatePicker
                selected={startDate}
                onChange={(update) => setDateRange(update as [Date | null, Date | null])}
                startDate={startDate}
                endDate={endDate}
                selectsRange // Ativa a seleção de intervalo de datas
                locale={ptBR} // Define o idioma como português
                dateFormat="dd/MM/yyyy" // Formato de data brasileiro
                className="h-10 px-2 border-0 rounded-lg text-lg focus:outline-none"
                placeholderText="Selecione o período"
            />
            {origem && startDate && endDate && (
            <div className="ml-2">
            
                <ButtonComponent
                    text="Buscar"
                    onClick={() => console.log('Buscando...')}
                    className="bg-green-500 text-white h-10 rounded-0"
                    icon={<MoveRight size={24} />}
                />
            
            </div>
            )}
        </div> 
               
    </div>
)};
export default PlanejarViagem;